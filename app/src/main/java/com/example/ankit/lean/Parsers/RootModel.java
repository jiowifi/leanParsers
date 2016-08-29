import java.util.ArrayList;

class RootModel {

	public String email;
	public String location_name;
	public String topic;
	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String start_time;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public String logo;
	public String name;
	public String type;
	public VersionModel _version;
	public String organizer_description;
	public String state;
	public String description;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String email, String location_name, String topic, String code_of_conduct, String timezone, CreatorModel creator, CopyrightModel copyright, String start_time, String end_time, ArrayList<Social_linksModel> social_links, String privacy, String organizer_name, String background_image, String logo, String name, String type, VersionModel version, String organizer_description, String state, String description, String schedule_published_on, int id, Call_for_papersModel call_for_papers) {

		this.email = email;
		this.location_name = location_name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this._copyright = copyright;
		this.start_time = start_time;
		this.end_time = end_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.type = type;
		this._version = version;
		this.organizer_description = organizer_description;
		this.state = state;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;

	}

}