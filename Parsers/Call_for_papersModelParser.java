import org.json.JSONException;
import org.json.JSONObject;

class Call_for_papersModelParser {


		public Call_for_papersModelParser() {
		}

		public Call_for_papersModel parseCall_for_papersModel(String json_object) {

			Call_for_papersModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Call_for_papersModel(jsobj.getString("timezone") , jsobj.getString("announcement") , jsobj.getString("privacy") , jsobj.getString("end_date") , jsobj.getString("start_date") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}