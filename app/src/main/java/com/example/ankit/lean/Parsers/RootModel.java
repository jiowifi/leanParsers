import java.util.ArrayList;

class RootModel {

	public String state;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String type;
	public String organizer_description;
	public String end_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String location_name;
	public String privacy;
	public String name;
	public String organizer_name;
	public String logo;
	public String timezone;
	public String topic;
	public VersionModel _version;
	public CreatorModel _creator;
	public String description;

	public RootModel(String state, int id, Call_for_papersModel call_for_papers, String background_image, String start_time, CopyrightModel copyright, String schedule_published_on, String type, String organizer_description, String end_time, String email, ArrayList<Social_linksModel> social_links, String code_of_conduct, String location_name, String privacy, String name, String organizer_name, String logo, String timezone, String topic, VersionModel version, CreatorModel creator, String description) {

		this.state = state;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.email = email;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.privacy = privacy;
		this.name = name;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.topic = topic;
		this._version = version;
		this._creator = creator;
		this.description = description;

	}

}