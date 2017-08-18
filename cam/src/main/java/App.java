import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class App {
    protected Cluster cluster;

    public static void main(String[] args) {
        App app = new App();
        try {
            app.run();
        } finally {
            app.close();
        }
    }

    public void run() {
        Session session = this.getSession();
        ResultSet rs = session.execute("select release_version from system.local");
        Row row = rs.one();
        System.out.println("verison is " + row.getString("release_version"));
    }

    public Cluster getCluster() {
        if (cluster == null) {
            cluster = Cluster.builder().addContactPoint("192.168.100.90").build();
        }
        return cluster;
    }

    public Session getSession() {
        return this.getCluster().connect();
    }

    public void close() {
        if (cluster != null) {
            cluster.close();
        }
    }
}
