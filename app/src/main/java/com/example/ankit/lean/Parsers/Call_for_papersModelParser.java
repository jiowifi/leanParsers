import org.json.JSONException;
import org.json.JSONObject;

class Call_for_papersModelParser {


		public Call_for_papersModelParser() {
		}

		public Call_for_papersModel parseCall_for_papersModel(String json_object) {

			Call_for_papersModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Call_for_papersModel(jsobj.getString("privacy") , jsobj.getString("start_date") , jsobj.getString("announcement") , jsobj.getString("timezone") , jsobj.getString("end_date") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}