import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String description;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public String name;
	public String organizer_description;
	public String start_time;
	public int id;
	public String end_time;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;
	public String state;
	public String topic;
	public String organizer_name;
	public String logo;
	public String background_image;
	public CreatorModel _creator;
	public String email;
	public String timezone;

	public RootModel(CopyrightModel copyright, String description, String schedule_published_on, String privacy, String location_name, String name, String organizer_description, String start_time, int id, String end_time, String type, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct, String state, String topic, String organizer_name, String logo, String background_image, CreatorModel creator, String email, String timezone) {

		this._copyright = copyright;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.background_image = background_image;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;

	}

}