import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public int id;
	public String timezone;
	public String email;
	public String organizer_name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String end_time;
	public String location_name;
	public String schedule_published_on;
	public String type;
	public String description;
	public String logo;
	public String privacy;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String background_image;
	public String start_time;
	public String organizer_description;
	public String name;

	public RootModel(CopyrightModel copyright, String state, int id, String timezone, String email, String organizer_name, String code_of_conduct, ArrayList<Social_linksModel> social_links, VersionModel version, String end_time, String location_name, String schedule_published_on, String type, String description, String logo, String privacy, CreatorModel creator, Call_for_papersModel call_for_papers, String topic, String background_image, String start_time, String organizer_description, String name) {

		this._copyright = copyright;
		this.state = state;
		this.id = id;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this._version = version;
		this.end_time = end_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.description = description;
		this.logo = logo;
		this.privacy = privacy;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.background_image = background_image;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.name = name;

	}

}