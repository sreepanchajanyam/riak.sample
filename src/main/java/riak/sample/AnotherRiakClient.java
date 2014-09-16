package riak.sample;

import java.util.HashMap;
import java.util.Map;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.RiakFactory;
import com.basho.riak.client.bucket.Bucket;

public class AnotherRiakClient {
	public static void main(String[] args) throws RiakException {
		IRiakClient irc = RiakFactory.pbcClient("127.0.0.1", 8087);
		Bucket intBucket = irc.fetchBucket("intBucket").execute();
		intBucket.store("Number One", 1).execute();
		intBucket.store("Number Two", 2).execute();
		Map<String, String> map = new HashMap<String, String>();
		map.put("First Name", "Sree");
		intBucket.store("Number Three", map).execute();
		System.out.println(intBucket.fetch("Number One").execute());
		System.out.println(intBucket.fetch("Number Two").execute());
		System.out.println(intBucket.fetch("Number Three").execute()
				.getValueAsString());
		System.out.println("\"\"\"\" MODIFIED Key 3\"\"");
		intBucket.store("Number Two", map).execute();
		System.out.println(intBucket.fetch("Number One").execute());
		System.out.println(intBucket.fetch("Number Two").execute());
		System.out.println(intBucket.fetch("Number Three").execute()
				.getValueAsString());
		System.exit(0);
	}
}
