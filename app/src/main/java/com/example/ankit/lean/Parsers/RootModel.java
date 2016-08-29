import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String end_time;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public String organizer_name;
	public String state;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public int id;
	public VersionModel _version;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String timezone;
	public String logo;
	public String email;
	public String start_time;
	public String topic;
	public String location_name;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String end_time, String type, String schedule_published_on, String background_image, String organizer_name, String state, String name, Call_for_papersModel call_for_papers, String privacy, String description, int id, VersionModel version, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, String timezone, String logo, String email, String start_time, String topic, String location_name) {

		this._copyright = copyright;
		this._creator = creator;
		this.end_time = end_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.state = state;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this.topic = topic;
		this.location_name = location_name;

	}

}