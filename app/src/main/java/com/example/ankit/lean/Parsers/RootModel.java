import java.util.ArrayList;

class RootModel {

	public String logo;
	public String type;
	public VersionModel _version;
	public String location_name;
	public int id;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String name;
	public String email;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String start_time;
	public String topic;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public String end_time;
	public String timezone;
	public String organizer_description;
	public CopyrightModel _copyright;

	public RootModel(String logo, String type, VersionModel version, String location_name, int id, String description, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String background_image, String name, String email, String code_of_conduct, CreatorModel creator, String start_time, String topic, String state, String schedule_published_on, String privacy, String end_time, String timezone, String organizer_description, CopyrightModel copyright) {

		this.logo = logo;
		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this.id = id;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.name = name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.start_time = start_time;
		this.topic = topic;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.end_time = end_time;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._copyright = copyright;

	}

}