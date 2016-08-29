import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String organizer_name;
	public String organizer_description;
	public int id;
	public String type;
	public String name;
	public String location_name;
	public String start_time;
	public String state;
	public String email;
	public String privacy;
	public String description;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String topic;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public String end_time;
	public String background_image;
	public String timezone;

	public RootModel(String schedule_published_on, String organizer_name, String organizer_description, int id, String type, String name, String location_name, String start_time, String state, String email, String privacy, String description, VersionModel version, CopyrightModel copyright, String topic, CreatorModel creator, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, String end_time, String background_image, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.id = id;
		this.type = type;
		this.name = name;
		this.location_name = location_name;
		this.start_time = start_time;
		this.state = state;
		this.email = email;
		this.privacy = privacy;
		this.description = description;
		this._version = version;
		this._copyright = copyright;
		this.topic = topic;
		this._creator = creator;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.background_image = background_image;
		this.timezone = timezone;

	}

}