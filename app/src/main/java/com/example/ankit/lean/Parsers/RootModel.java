import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String privacy;
	public String end_time;
	public String location_name;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public String description;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String start_time;
	public int id;
	public String organizer_description;
	public String name;
	public String background_image;
	public String logo;
	public String type;
	public String email;
	public String timezone;

	public RootModel(String code_of_conduct, String privacy, String end_time, String location_name, CopyrightModel copyright, String topic, String organizer_name, String description, CreatorModel creator, Call_for_papersModel call_for_papers, String state, String schedule_published_on, ArrayList<Social_linksModel> social_links, VersionModel version, String start_time, int id, String organizer_description, String name, String background_image, String logo, String type, String email, String timezone) {

		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.end_time = end_time;
		this.location_name = location_name;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.description = description;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this._version = version;
		this.start_time = start_time;
		this.id = id;
		this.organizer_description = organizer_description;
		this.name = name;
		this.background_image = background_image;
		this.logo = logo;
		this.type = type;
		this.email = email;
		this.timezone = timezone;

	}

}