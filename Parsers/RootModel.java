import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String location_name;
	public VersionModel _version;
	public String privacy;
	public String description;
	public String type;
	public String timezone;
	public String state;
	public String code_of_conduct;
	public String end_time;
	public String organizer_description;
	public String topic;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public int id;
	public String organizer_name;
	public String email;
	public String start_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String location_name, VersionModel version, String privacy, String description, String type, String timezone, String state, String code_of_conduct, String end_time, String organizer_description, String topic, String name, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, int id, String organizer_name, String email, String start_time, String logo, Call_for_papersModel call_for_papers) {

		this._copyright = copyright;
		this._creator = creator;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;
		this.description = description;
		this.type = type;
		this.timezone = timezone;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.name = name;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.id = id;
		this.organizer_name = organizer_name;
		this.email = email;
		this.start_time = start_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;

	}

}