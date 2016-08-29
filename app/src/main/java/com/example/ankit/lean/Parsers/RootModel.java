import java.util.ArrayList;

class RootModel {

	public String logo;
	public String email;
	public String location_name;
	public String background_image;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String type;
	public String schedule_published_on;
	public String state;
	public String name;
	public String start_time;
	public String description;
	public String privacy;
	public String code_of_conduct;
	public String topic;
	public int id;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;

	public RootModel(String logo, String email, String location_name, String background_image, VersionModel version, ArrayList<Social_linksModel> social_links, String end_time, String type, String schedule_published_on, String state, String name, String start_time, String description, String privacy, String code_of_conduct, String topic, int id, String organizer_description, Call_for_papersModel call_for_papers, String timezone, CreatorModel creator, String organizer_name, CopyrightModel copyright) {

		this.logo = logo;
		this.email = email;
		this.location_name = location_name;
		this.background_image = background_image;
		this._version = version;
		this.social_links = social_links;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.name = name;
		this.start_time = start_time;
		this.description = description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.id = id;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;

	}

}