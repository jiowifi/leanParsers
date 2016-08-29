import java.util.ArrayList;

class RootModel {

	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String logo;
	public VersionModel _version;
	public String name;
	public String topic;
	public int id;
	public CreatorModel _creator;
	public String timezone;
	public String background_image;
	public String privacy;
	public String description;
	public String organizer_description;
	public String end_time;
	public String schedule_published_on;
	public String location_name;
	public String start_time;
	public String code_of_conduct;
	public String type;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;

	public RootModel(String email, ArrayList<Social_linksModel> social_links, String state, String logo, VersionModel version, String name, String topic, int id, CreatorModel creator, String timezone, String background_image, String privacy, String description, String organizer_description, String end_time, String schedule_published_on, String location_name, String start_time, String code_of_conduct, String type, String organizer_name, Call_for_papersModel call_for_papers, CopyrightModel copyright) {

		this.email = email;
		this.social_links = social_links;
		this.state = state;
		this.logo = logo;
		this._version = version;
		this.name = name;
		this.topic = topic;
		this.id = id;
		this._creator = creator;
		this.timezone = timezone;
		this.background_image = background_image;
		this.privacy = privacy;
		this.description = description;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;

	}

}