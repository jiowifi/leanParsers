import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String end_time;
	public String name;
	public String code_of_conduct;
	public String state;
	public String background_image;
	public String description;
	public String topic;
	public String type;
	public String logo;
	public int id;
	public CreatorModel _creator;
	public String start_time;
	public CopyrightModel _copyright;
	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String email;
	public String timezone;

	public RootModel(String location_name, String end_time, String name, String code_of_conduct, String state, String background_image, String description, String topic, String type, String logo, int id, CreatorModel creator, String start_time, CopyrightModel copyright, String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, VersionModel version, String organizer_name, ArrayList<Social_linksModel> social_links, String organizer_description, String email, String timezone) {

		this.location_name = location_name;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.background_image = background_image;
		this.description = description;
		this.topic = topic;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this._creator = creator;
		this.start_time = start_time;
		this._copyright = copyright;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.email = email;
		this.timezone = timezone;

	}

}