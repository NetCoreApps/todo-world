package net.servicestack.androidgrpc;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import net.servicestack.ChannelBuilder;

import java.io.InputStream;

import io.grpc.ManagedChannel;
import io.grpc.stub.StreamObserver;

public class MainActivity extends AppCompatActivity {

       @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ManagedChannel channel = null;
        InputStream is = null;
        try {
            is = getResources().getAssets().open("grpc.crt");
            channel = ChannelBuilder.buildTls(
                "todoworld.servicestack.net", 50051, is);
            is.close();
        } catch (Throwable e) {
            e.printStackTrace();
        }

        final GrpcServicesGrpc.GrpcServicesStub client =
            GrpcServicesGrpc.newStub(channel);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

            client.getHello(Services.Hello.newBuilder()
                .setName("gRPC SSL").build(),
                new StreamObserver<Services.HelloResponse>() {
                    @Override
                    public void onNext(Services.HelloResponse value) {
                        Snackbar.make(view, value.getResult(), Snackbar.LENGTH_LONG)
                                .setAction("Action", null).show();
                    }
                    @Override public void onError(Throwable t) {}
                    @Override public void onCompleted() {}
                });
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
