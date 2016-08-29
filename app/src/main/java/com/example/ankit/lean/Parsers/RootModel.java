import java.util.ArrayList;

class RootModel {

	public String logo;
	public int id;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String state;
	public String description;
	public String organizer_description;
	public String topic;
	public String end_time;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public String type;
	public String background_image;
	public VersionModel _version;
	public String timezone;

	public RootModel(String logo, int id, CopyrightModel copyright, CreatorModel creator, String start_time, ArrayList<Social_linksModel> social_links, String location_name, Call_for_papersModel call_for_papers, String privacy, String state, String description, String organizer_description, String topic, String end_time, String name, String code_of_conduct, String organizer_name, String schedule_published_on, String email, String type, String background_image, VersionModel version, String timezone) {

		this.logo = logo;
		this.id = id;
		this._copyright = copyright;
		this._creator = creator;
		this.start_time = start_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.state = state;
		this.description = description;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.end_time = end_time;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.type = type;
		this.background_image = background_image;
		this._version = version;
		this.timezone = timezone;

	}

}