import org.json.JSONException;
import org.json.JSONObject;

class CreatoModelParser {


		public CreatoModelParser() {
		}

		public CreatoModel parseCreatoModel(String json_object) {

			CreatoModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new CreatoModel(jsobj.getString("email") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}