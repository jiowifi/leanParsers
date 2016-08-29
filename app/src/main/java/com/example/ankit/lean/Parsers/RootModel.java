import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public String logo;
	public String description;
	public String topic;
	public String start_time;
	public String type;
	public String privacy;
	public String code_of_conduct;
	public String name;
	public String organizer_description;
	public String background_image;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String state;
	public String email;
	public String organizer_name;
	public String location_name;
	public String timezone;

	public RootModel(String schedule_published_on, CreatorModel creator, String logo, String description, String topic, String start_time, String type, String privacy, String code_of_conduct, String name, String organizer_description, String background_image, VersionModel version, ArrayList<Social_linksModel> social_links, String end_time, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, String state, String email, String organizer_name, String location_name, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.logo = logo;
		this.description = description;
		this.topic = topic;
		this.start_time = start_time;
		this.type = type;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._version = version;
		this.social_links = social_links;
		this.end_time = end_time;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.state = state;
		this.email = email;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.timezone = timezone;

	}

}