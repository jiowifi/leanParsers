import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String background_image;
	public CreatorModel _creator;
	public String start_time;
	public String timezone;
	public String description;
	public String state;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String logo;
	public String schedule_published_on;
	public String privacy;
	public String name;
	public int id;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String organizer_description;
	public String type;
	public String organizer_name;
	public String code_of_conduct;
	public VersionModel _version;

	public RootModel(String location_name, String background_image, CreatorModel creator, String start_time, String timezone, String description, String state, String topic, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String logo, String schedule_published_on, String privacy, String name, int id, String email, Call_for_papersModel call_for_papers, String end_time, String organizer_description, String type, String organizer_name, String code_of_conduct, VersionModel version) {

		this.location_name = location_name;
		this.background_image = background_image;
		this._creator = creator;
		this.start_time = start_time;
		this.timezone = timezone;
		this.description = description;
		this.state = state;
		this.topic = topic;
		this.social_links = social_links;
		this._copyright = copyright;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;

	}

}