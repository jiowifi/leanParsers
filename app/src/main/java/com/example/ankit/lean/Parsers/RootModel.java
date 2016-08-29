import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public VersionModel _version;
	public CreatorModel _creator;
	public String state;
	public String organizer_name;
	public String organizer_description;
	public String code_of_conduct;
	public String email;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String privacy;
	public String end_time;
	public String topic;
	public String background_image;
	public String start_time;
	public String logo;
	public String description;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String schedule_published_on;
	public String name;

	public RootModel(CopyrightModel copyright, VersionModel version, CreatorModel creator, String state, String organizer_name, String organizer_description, String code_of_conduct, String email, String location_name, ArrayList<Social_linksModel> social_links, int id, String privacy, String end_time, String topic, String background_image, String start_time, String logo, String description, String type, Call_for_papersModel call_for_papers, String timezone, String schedule_published_on, String name) {

		this._copyright = copyright;
		this._version = version;
		this._creator = creator;
		this.state = state;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.location_name = location_name;
		this.social_links = social_links;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.topic = topic;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.name = name;

	}

}