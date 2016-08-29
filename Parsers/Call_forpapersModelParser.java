import org.json.JSONException;
import org.json.JSONObject;

class Call_forpapersModelParser {


		public Call_forpapersModelParser() {
		}

		public Call_forpapersModel parseCall_forpapersModel(String json_object) {

			Call_forpapersModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Call_forpapersModel(jsobj.getString("startdate") , jsobj.getString("timezosne") , jsobj.getString("enddate") , jsobj.getString("pridvacy") , jsobj.getString("announ") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}