import org.json.JSONException;
import org.json.JSONObject;

class Copyrigh_tModelParser {


		public Copyrigh_tModelParser() {
		}

		public Copyrigh_tModel parseCopyrigh_tModel(String json_object) {

			Copyrigh_tModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Copyrigh_tModel(jsobj.getString("holder") , jsobj.getString("licence_url") , jsobj.getInt("year") , jsobj.getString("logo") , jsobj.getString("holder_url") , jsobj.getString("licence") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}