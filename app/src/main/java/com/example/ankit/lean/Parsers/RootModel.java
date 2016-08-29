import java.util.ArrayList;

class RootModel {

	public String type;
	public String schedule_published_on;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String email;
	public String state;
	public String organizer_name;
	public String end_time;
	public String logo;
	public String topic;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String description;
	public String name;
	public String location_name;
	public String timezone;

	public RootModel(String type, String schedule_published_on, String privacy, String code_of_conduct, String start_time, CreatorModel creator, String background_image, String organizer_description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, int id, String email, String state, String organizer_name, String end_time, String logo, String topic, CopyrightModel copyright, VersionModel version, String description, String name, String location_name, String timezone) {

		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.id = id;
		this.email = email;
		this.state = state;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.logo = logo;
		this.topic = topic;
		this._copyright = copyright;
		this._version = version;
		this.description = description;
		this.name = name;
		this.location_name = location_name;
		this.timezone = timezone;

	}

}