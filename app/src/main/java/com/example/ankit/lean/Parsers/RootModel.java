import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String description;
	public String state;
	public String start_time;
	public String type;
	public String organizer_description;
	public String schedule_published_on;
	public String privacy;
	public CreatorModel _creator;
	public String timezone;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String code_of_conduct;
	public String background_image;
	public String logo;
	public int id;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, String location_name, String name, Call_for_papersModel call_for_papers, VersionModel version, String description, String state, String start_time, String type, String organizer_description, String schedule_published_on, String privacy, CreatorModel creator, String timezone, String email, ArrayList<Social_linksModel> social_links, String end_time, String code_of_conduct, String background_image, String logo, int id, String topic, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._creator = creator;
		this.timezone = timezone;
		this.email = email;
		this.social_links = social_links;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.logo = logo;
		this.id = id;
		this.topic = topic;
		this._copyright = copyright;

	}

}