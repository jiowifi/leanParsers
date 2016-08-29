import java.util.ArrayList;

class RootModel {

	public String logo;
	public String type;
	public CopyrightModel _copyright;
	public String topic;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String location_name;
	public String name;
	public String email;
	public String privacy;
	public String organizer_description;
	public String timezone;
	public VersionModel _version;
	public String end_time;
	public String start_time;
	public String schedule_published_on;
	public String state;
	public int id;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String logo, String type, CopyrightModel copyright, String topic, String organizer_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String code_of_conduct, String background_image, String description, String location_name, String name, String email, String privacy, String organizer_description, String timezone, VersionModel version, String end_time, String start_time, String schedule_published_on, String state, int id, Call_for_papersModel call_for_papers) {

		this.logo = logo;
		this.type = type;
		this._copyright = copyright;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.location_name = location_name;
		this.name = name;
		this.email = email;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this._version = version;
		this.end_time = end_time;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.id = id;
		this._call_for_papers = call_for_papers;

	}

}