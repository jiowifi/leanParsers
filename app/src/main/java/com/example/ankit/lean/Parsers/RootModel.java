import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public String logo;
	public String email;
	public String privacy;
	public String location_name;
	public String background_image;
	public String end_time;
	public String state;
	public String topic;
	public String organizer_description;
	public String schedule_published_on;
	public String name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String organizer_name, int id, VersionModel version, CopyrightModel copyright, String code_of_conduct, String type, ArrayList<Social_linksModel> social_links, String description, CreatorModel creator, String start_time, String timezone, String logo, String email, String privacy, String location_name, String background_image, String end_time, String state, String topic, String organizer_description, String schedule_published_on, String name, Call_for_papersModel call_for_papers) {

		this.organizer_name = organizer_name;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.social_links = social_links;
		this.description = description;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.location_name = location_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.state = state;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this._call_for_papers = call_for_papers;

	}

}