import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String type;
	public String topic;
	public String end_time;
	public String name;
	public String timezone;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public String description;
	public String logo;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String background_image;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;

	public RootModel(String privacy, String state, ArrayList<Social_linksModel> social_links, String start_time, String type, String topic, String end_time, String name, String timezone, String schedule_published_on, String location_name, String organizer_description, String description, String logo, String organizer_name, CopyrightModel copyright, String code_of_conduct, String background_image, int id, Call_for_papersModel call_for_papers, CreatorModel creator, String email, VersionModel version) {

		this.privacy = privacy;
		this.state = state;
		this.social_links = social_links;
		this.start_time = start_time;
		this.type = type;
		this.topic = topic;
		this.end_time = end_time;
		this.name = name;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.email = email;
		this._version = version;

	}

}