import java.util.ArrayList;

class RootModel {

	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public VersionModel _version;
	public String topic;
	public String location_name;
	public int id;
	public String logo;
	public String description;
	public String organizer_description;
	public String email;
	public String organizer_name;
	public String code_of_conduct;
	public String start_time;
	public CreatorModel _creator;
	public String background_image;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String type, ArrayList<Social_linksModel> social_links, String end_time, VersionModel version, String topic, String location_name, int id, String logo, String description, String organizer_description, String email, String organizer_name, String code_of_conduct, String start_time, CreatorModel creator, String background_image, String state, String schedule_published_on, String privacy, CopyrightModel copyright, String timezone, String name, Call_for_papersModel call_for_papers) {

		this.type = type;
		this.social_links = social_links;
		this.end_time = end_time;
		this._version = version;
		this.topic = topic;
		this.location_name = location_name;
		this.id = id;
		this.logo = logo;
		this.description = description;
		this.organizer_description = organizer_description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._creator = creator;
		this.background_image = background_image;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this._call_for_papers = call_for_papers;

	}

}