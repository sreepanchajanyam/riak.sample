package riak.sample;

import java.util.HashMap;
import java.util.Map;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.IRiakObject;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.RiakFactory;
import com.basho.riak.client.bucket.Bucket;

public class RiakJavaClient {

		public static void main(String[] args) throws RiakException {
			IRiakClient client = RiakFactory.pbcClient("127.0.0.1", 8087);
			Bucket myBucket = client.fetchBucket("test").execute();
			/*int val1 = 1;
			String val2 = "two in two";
			Map<String, Integer> stringVsInt = new HashMap<String, Integer>();
			Object obj = new Object();
			myBucket.store("one", val1).execute();
			myBucket.store("two", val2).execute();
			stringVsInt.put("Integer 1", 100);
			stringVsInt.put("Integer 2", 200);
			stringVsInt.put("Integer 3", 300);
			myBucket.store("five", stringVsInt).execute();
			Integer fetched1 = myBucket.fetch("one", Integer.class).execute();
			IRiakObject fetched2 = myBucket.fetch("two").execute();
			IRiakObject fetched3 = myBucket.fetch("three").execute();
			System.out.println(fetched1 + "\n" + fetched2.getValueAsString() + "\n" + fetched3);
			myBucket.store("three", "42").execute();
			fetched3 = myBucket.fetch("three").execute();
			IRiakObject fetched5 = myBucket.fetch("five").execute();
			System.out.println("Modified");
			System.out.println(fetched1 + "\n" + fetched2.getValueAsString() + "\n" + fetched3.getValueAsString() + "\n" + fetched5.getValueAsString());
			Book book = new Book();
			book.ISBN = "1111979723";
			book.Title = "Moby Dick";
			book.Author = "Herman Melville";
			book.Body = "Call me Ishmael. Some years ago...";
			book.CopiesOwned = 3;
			myBucket.store("four", book).execute();
			System.out.println(myBucket.fetch("four").execute().getValueAsString());*/
			System.out.println(myBucket.fetch("integer1",Integer.class).execute());
			System.out.println(myBucket.fetch("integer2",Integer.class).execute());
			System.out.println(myBucket.fetch("one",Integer.class).execute());
			System.out.println(myBucket.fetch("string1").execute().getValueAsString());
			System.exit(0);
		}
}	


class Book
{
    public String Title;
    public String Author;
    public String Body;
    public String ISBN;
    public Integer CopiesOwned;
}