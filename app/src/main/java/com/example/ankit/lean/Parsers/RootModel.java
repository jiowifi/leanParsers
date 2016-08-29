import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public CreatorModel _creator;
	public String description;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String name;
	public int id;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String location_name;
	public String start_time;
	public VersionModel _version;
	public String privacy;
	public String topic;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public String logo;
	public CopyrightModel _copyright;

	public RootModel(String background_image, String type, CreatorModel creator, String description, String state, String end_time, ArrayList<Social_linksModel> social_links, String organizer_name, String name, int id, String timezone, Call_for_papersModel call_for_papers, String email, String location_name, String start_time, VersionModel version, String privacy, String topic, String organizer_description, String code_of_conduct, String schedule_published_on, String logo, CopyrightModel copyright) {

		this.background_image = background_image;
		this.type = type;
		this._creator = creator;
		this.description = description;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.name = name;
		this.id = id;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.location_name = location_name;
		this.start_time = start_time;
		this._version = version;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._copyright = copyright;

	}

}