import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public String name;
	public String state;
	public String location_name;
	public int id;
	public String background_image;
	public String code_of_conduct;
	public String start_time;
	public String timezone;
	public String email;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String type;
	public String end_time;
	public String topic;
	public VersionModel _version;

	public RootModel(CopyrightModel copyright, String schedule_published_on, String description, String organizer_description, String name, String state, String location_name, int id, String background_image, String code_of_conduct, String start_time, String timezone, String email, String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, CreatorModel creator, Call_for_papersModel call_for_papers, String logo, String type, String end_time, String topic, VersionModel version) {

		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.name = name;
		this.state = state;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.timezone = timezone;
		this.email = email;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.topic = topic;
		this._version = version;

	}

}