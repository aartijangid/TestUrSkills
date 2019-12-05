package test.java.connect.mongodb;

import java.util.Iterator;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class ConnectMongoDB {

	public static void main(String[] args) {
		MongoClientURI uri = null;
		MongoClient mongoClient = null;
		MongoDatabase database = null;
		try {

			// Creating a Mongo client URI
			uri = new MongoClientURI(
					"mongodb+srv://rt_usr_cluser_1:rt_usr_cluser_1@rt-cluster-1-da72r.mongodb.net/test?retryWrites=true&w=majority");

			// Creating a Mongo client
			mongoClient = new MongoClient(uri);

			// Accessing the database
			database = mongoClient.getDatabase("sample_mflix");

			System.out.println("Connected to the database successfully");

			// Retieving a collection
			MongoCollection<Document> collection = database.getCollection("movies");

			System.out.println("Collection examplesCollection selected successfully");

			System.out.println("Size of collection: " +collection.count());

			// Getting the iterable object
			FindIterable<Document> iterDoc = collection.find();
			int i = 1;

			// Getting the iterator to read first 5
			Iterator it = iterDoc.iterator();
			for(i = 1; i < 5; i++)
				System.out.println(it.next());

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			mongoClient.close();

		}
	}

}
