import org.json.JSONException;
import org.json.JSONObject;

class Socfgial_linksModelParser {


		public Socfgial_linksModelParser() {
		}

		public Socfgial_linksModel parseSocfgial_linksModel(String json_object) {

			Socfgial_linksModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Socfgial_linksModel(jsobj.getInt("id") , jsobj.getString("name") , jsobj.getString("link") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}