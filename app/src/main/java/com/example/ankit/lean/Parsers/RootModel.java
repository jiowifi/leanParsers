import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public String timezone;
	public int id;
	public String logo;
	public String schedule_published_on;
	public String topic;
	public CreatorModel _creator;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;
	public String background_image;
	public String type;
	public String email;
	public VersionModel _version;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String end_time, String name, String timezone, int id, String logo, String schedule_published_on, String topic, CreatorModel creator, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, String state, String start_time, String organizer_name, String privacy, String description, CopyrightModel copyright, String background_image, String type, String email, VersionModel version, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.end_time = end_time;
		this.name = name;
		this.timezone = timezone;
		this.id = id;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.topic = topic;
		this._creator = creator;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.state = state;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;
		this.background_image = background_image;
		this.type = type;
		this.email = email;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}