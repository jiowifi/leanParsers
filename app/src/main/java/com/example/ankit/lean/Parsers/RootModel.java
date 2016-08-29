import java.util.ArrayList;

class RootModel {

	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String description;
	public String privacy;
	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public String topic;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String start_time;
	public String name;
	public String background_image;
	public String timezone;
	public VersionModel _version;
	public String end_time;
	public CopyrightModel _copyright;

	public RootModel(String email, int id, ArrayList<Social_linksModel> social_links, String organizer_name, String state, CreatorModel creator, String code_of_conduct, String description, String privacy, String schedule_published_on, String type, String organizer_description, String topic, String location_name, Call_for_papersModel call_for_papers, String logo, String start_time, String name, String background_image, String timezone, VersionModel version, String end_time, CopyrightModel copyright) {

		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.start_time = start_time;
		this.name = name;
		this.background_image = background_image;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;
		this._copyright = copyright;

	}

}