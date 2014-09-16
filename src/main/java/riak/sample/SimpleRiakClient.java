package riak.sample;

import riak.util.MyWebSession;
import riak.util.SessionStubFactory;

import com.basho.riak.client.IRiakClient;
import com.basho.riak.client.RiakException;
import com.basho.riak.client.RiakFactory;
import com.basho.riak.client.bucket.Bucket;

public class SimpleRiakClient {
	public static void main(String[] args) throws RiakException {
		IRiakClient irc = RiakFactory.pbcClient("127.0.0.1", 8087);
		Bucket sessionBucket = irc.fetchBucket("WEB_SESSION").execute();
		MyWebSession session1 = SessionStubFactory.getMyWebSessionStub();
		MyWebSession session2 = SessionStubFactory.getMyWebSessionStub();
		/*List<String> userList = new ArrayList<String>(); */
		String userID = session1.getUserID();
		sessionBucket.store(session1.getUserID()+5,session1).execute();
		System.out.println("Session 1: " + session1);
		sessionBucket.store(session1.getUserID()+5,session2).execute();
		System.out.println("Session 2: " + session2);
		System.out.println(sessionBucket.fetch(userID+5).execute().getValueAsString());
		/*sessionBucket.store(session1.getUserID()+4,"session2").execute();
		System.out.println(sessionBucket.fetch(userID+4).execute().getValueAsString());*/
	}
}
