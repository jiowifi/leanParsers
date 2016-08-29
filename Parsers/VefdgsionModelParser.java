import org.json.JSONException;
import org.json.JSONObject;

class VefdgsionModelParser {


		public VefdgsionModelParser() {
		}

		public VefdgsionModel parseVefdgsionModel(String json_object) {

			VefdgsionModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new VefdgsionModel(jsobj.getInt("event_er") , jsobj.getInt("speaers_ver") , jsobj.getInt("ession_er") , jsobj.getInt("track_ver") , jsobj.getInt("sponsrs_ver") , jsobj.getInt("microloations_ver") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}