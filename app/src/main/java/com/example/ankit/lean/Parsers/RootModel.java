import java.util.ArrayList;

class RootModel {

	public String type;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String description;
	public String location_name;
	public String start_time;
	public VersionModel _version;
	public String email;
	public String background_image;
	public String logo;
	public String name;
	public String privacy;
	public String organizer_name;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public int id;
	public String end_time;

	public RootModel(String type, String schedule_published_on, CopyrightModel copyright, CreatorModel creator, String description, String location_name, String start_time, VersionModel version, String email, String background_image, String logo, String name, String privacy, String organizer_name, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, String topic, String timezone, ArrayList<Social_linksModel> social_links, String state, int id, String end_time) {

		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._creator = creator;
		this.description = description;
		this.location_name = location_name;
		this.start_time = start_time;
		this._version = version;
		this.email = email;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.timezone = timezone;
		this.social_links = social_links;
		this.state = state;
		this.id = id;
		this.end_time = end_time;

	}

}