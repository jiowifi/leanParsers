import org.json.JSONException;
import org.json.JSONObject;

class VesionModelParser {


		public VesionModelParser() {
		}

		public VesionModel parseVesionModel(String json_object) {

			VesionModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new VesionModel(jsobj.getInt("speaers_ver") , jsobj.getInt("sponsrs_ver") , jsobj.getInt("track_ver") , jsobj.getInt("ession_er") , jsobj.getInt("microloations_ver") , jsobj.getInt("event_er") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}