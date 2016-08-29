import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public String type;
	public VersionModel _version;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String topic;
	public String state;
	public int id;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;
	public String name;
	public String end_time;
	public String email;
	public String start_time;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public String timezone;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String location_name, String logo, String type, VersionModel version, String background_image, Call_for_papersModel call_for_papers, CreatorModel creator, String topic, String state, int id, String privacy, String description, CopyrightModel copyright, String name, String end_time, String email, String start_time, String code_of_conduct, String organizer_name, String schedule_published_on, String timezone, String organizer_description, ArrayList<Social_linksModel> social_links) {

		this.location_name = location_name;
		this.logo = logo;
		this.type = type;
		this._version = version;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.topic = topic;
		this.state = state;
		this.id = id;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;
		this.name = name;
		this.end_time = end_time;
		this.email = email;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.social_links = social_links;

	}

}