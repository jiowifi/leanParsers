import java.util.ArrayList;

class RootModel {

	public String description;
	public String background_image;
	public int id;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public String end_time;
	public String schedule_published_on;
	public String topic;
	public String start_time;
	public String name;
	public String type;
	public String organizer_description;
	public String privacy;
	public String timezone;
	public String state;
	public CreatorModel _creator;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String description, String background_image, int id, VersionModel version, CopyrightModel copyright, String organizer_name, String code_of_conduct, String email, String location_name, String end_time, String schedule_published_on, String topic, String start_time, String name, String type, String organizer_description, String privacy, String timezone, String state, CreatorModel creator, String logo, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers) {

		this.description = description;
		this.background_image = background_image;
		this.id = id;
		this._version = version;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this.start_time = start_time;
		this.name = name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.state = state;
		this._creator = creator;
		this.logo = logo;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;

	}

}