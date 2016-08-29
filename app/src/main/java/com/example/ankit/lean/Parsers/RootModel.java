import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String organizer_description;
	public String state;
	public VersionModel _version;
	public String background_image;
	public String description;
	public String organizer_name;
	public String start_time;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public int id;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String end_time;
	public String timezone;

	public RootModel(String schedule_published_on, String organizer_description, String state, VersionModel version, String background_image, String description, String organizer_name, String start_time, CopyrightModel copyright, String code_of_conduct, int id, String email, String name, Call_for_papersModel call_for_papers, String privacy, String type, String logo, CreatorModel creator, String topic, ArrayList<Social_linksModel> social_links, String location_name, String end_time, String timezone) {

		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.state = state;
		this._version = version;
		this.background_image = background_image;
		this.description = description;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.topic = topic;
		this.social_links = social_links;
		this.location_name = location_name;
		this.end_time = end_time;
		this.timezone = timezone;

	}

}