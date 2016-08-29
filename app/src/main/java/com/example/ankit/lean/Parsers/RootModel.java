import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String organizer_name;
	public String end_time;
	public String name;
	public String state;
	public String schedule_published_on;
	public String description;
	public String logo;
	public VersionModel _version;
	public String topic;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String email;
	public String timezone;
	public int id;
	public String privacy;
	public String background_image;

	public RootModel(CopyrightModel copyright, Call_for_papersModel call_for_papers, String code_of_conduct, String organizer_name, String end_time, String name, String state, String schedule_published_on, String description, String logo, VersionModel version, String topic, String location_name, ArrayList<Social_linksModel> social_links, String type, String organizer_description, String start_time, CreatorModel creator, String email, String timezone, int id, String privacy, String background_image) {

		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.name = name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.logo = logo;
		this._version = version;
		this.topic = topic;
		this.location_name = location_name;
		this.social_links = social_links;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.email = email;
		this.timezone = timezone;
		this.id = id;
		this.privacy = privacy;
		this.background_image = background_image;

	}

}