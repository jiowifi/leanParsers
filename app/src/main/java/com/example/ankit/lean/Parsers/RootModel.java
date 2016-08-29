import java.util.ArrayList;

class RootModel {

	public String description;
	public String email;
	public String state;
	public String location_name;
	public String name;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public VersionModel _version;
	public String start_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String schedule_published_on;
	public String end_time;
	public CreatorModel _creator;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String background_image;
	public String organizer_description;
	public String logo;
	public String organizer_name;
	public String timezone;

	public RootModel(String description, String email, String state, String location_name, String name, int id, Call_for_papersModel call_for_papers, String type, VersionModel version, String start_time, CopyrightModel copyright, String code_of_conduct, String schedule_published_on, String end_time, CreatorModel creator, String privacy, ArrayList<Social_linksModel> social_links, String topic, String background_image, String organizer_description, String logo, String organizer_name, String timezone) {

		this.description = description;
		this.email = email;
		this.state = state;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this._version = version;
		this.start_time = start_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._creator = creator;
		this.privacy = privacy;
		this.social_links = social_links;
		this.topic = topic;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.timezone = timezone;

	}

}