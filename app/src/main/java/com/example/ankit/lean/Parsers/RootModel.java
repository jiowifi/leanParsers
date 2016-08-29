import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public int id;
	public String schedule_published_on;
	public String type;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String email;
	public String state;
	public String description;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String privacy;
	public String location_name;
	public String logo;
	public String start_time;
	public String background_image;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String timezone;

	public RootModel(String organizer_name, String organizer_description, int id, String schedule_published_on, String type, CopyrightModel copyright, Call_for_papersModel call_for_papers, CreatorModel creator, String email, String state, String description, String name, ArrayList<Social_linksModel> social_links, String end_time, String privacy, String location_name, String logo, String start_time, String background_image, VersionModel version, String code_of_conduct, String topic, String timezone) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.email = email;
		this.state = state;
		this.description = description;
		this.name = name;
		this.social_links = social_links;
		this.end_time = end_time;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;
		this.start_time = start_time;
		this.background_image = background_image;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.timezone = timezone;

	}

}