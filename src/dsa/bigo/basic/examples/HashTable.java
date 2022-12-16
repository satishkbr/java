package dsa.bigo.basic.examples;

import java.util.Arrays;
import java.util.Objects;

public class HashTable {

	//Array data = new Array();
	Object[] data = null;
	public HashTable(int size) {
		this.data = new Object[size];
	}


	private int hashCode(Object key) {
		int hash = 0;
		String stringKey = String.valueOf(key);
		for (int i =0; i < stringKey.length(); i++){
			hash = (hash + stringKey.charAt(i) * i) % this.data.length;
		}
		return hash;
	}
	//[   [grapes,10000]   ]
	public void set(Object key, Object value) {
		//write method
		//store in addressspace based on key
		int address = this.hashCode(key);
		if(data[address]!=null) {
			Object[] bucketObjects = (Object[])data[address];//each bucket is object array
			//add object to this bucket
			Object[] newBucketObjects = new Object[bucketObjects.length+1];
			for(int i=0;i<bucketObjects.length;i++) {
				newBucketObjects[i]=bucketObjects[i];
			}
			newBucketObjects[bucketObjects.length]=new Pair(key,value);
			data[address]= newBucketObjects;
		}
		else {
			Object[] bucketObjects = new Object[1];
			bucketObjects[0] = new Pair(key,value);
			data[address]=bucketObjects;
		}
	}

	public Object get(Object key) {
		//get address
		int address = this.hashCode(key);
		Object[] bucketObjects = (Object[])data[address];//each bucket is object array
		for(int i=0;i<bucketObjects.length;i++) {
			String keyInPair = ((Pair)bucketObjects[i]).getKey().toString();
			String searchKey =key.toString(); 
			if(keyInPair.equals(searchKey))
				return ((Pair)bucketObjects[i]).getValue();
		}
		return null;
	}
	public Objects[] keys() {
		//iterate all the buckets
		StringBuilder sb = new StringBuilder();
		if(this.data == null) return null;
		else {
		for(int i=0;i<this.data.length;i++) {
			Object[] bucketArray = (Object[])this.data[i];
			if(bucketArray.length>1) {
				
			}else {
			//	Object keyObject  = ((Pair)this.data[i][0]).getKey();
				//sb.append();
			}
			
		}
		return null;
		}
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i=0;i<data.length-1;i++) {
			if(data[i]==null)
				sb.append(data[i]).append(",");
			else {
				Object[] bucketObjects = (Object[])data[i];
				sb.append("[");
				for(int j=0;j<bucketObjects.length-1;j++) {
					sb.append(((Pair)bucketObjects[j]).toString());
				}
				sb.append(((Pair)bucketObjects[bucketObjects.length-1]).toString()).append("]");
			}
		}
		sb.append(data[data.length-1]).append("]");
		return sb.toString();
	}

	private void appendInnerObjects(StringBuilder sb,Object dataBucket) {
		Object[] bucketObjects = (Object[])dataBucket;
		sb.append("[");
		for(int j=0;j<bucketObjects.length-1;j++) {
			sb.append(bucketObjects[j]);
		}
		sb.append(bucketObjects[bucketObjects.length-1]).append("]");
	}


	public static void main(String[] args) {
		HashTable ht = new HashTable(2);
		System.out.println(ht.hashCode("grapes"));
		ht.set("grapes", 50000);
		ht.set("apples", 60000);
		Object val = ht.get("grapes");
		System.out.println(val);

		System.out.println(ht);


	}
	class Pair{
		private Object value = null;
		private Object key = null;
		/**
		 * @param value
		 * @param key
		 */
		public Pair(Object key, Object value ) {
			super();
			this.value = value;
			this.key = key;
		}
		public Object getValue() {
			return value;
		}
		public void setValue(Object value) {
			this.value = value;
		}
		public Object getKey() {
			return key;
		}
		public void setKey(Object key) {
			this.key = key;
		}
		@Override
		public String toString() {
			return "["+String.valueOf(key)+","+String.valueOf(value)+"]";
		}


	}

}
