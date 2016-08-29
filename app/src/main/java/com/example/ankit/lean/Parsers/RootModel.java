import java.util.ArrayList;

class RootModel {

	public int id;
	public CreatorModel _creator;
	public String email;
	public String organizer_name;
	public String description;
	public String name;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String start_time;
	public String timezone;
	public VersionModel _version;
	public String schedule_published_on;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public String logo;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String location_name;
	public String end_time;

	public RootModel(int id, CreatorModel creator, String email, String organizer_name, String description, String name, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String topic, String start_time, String timezone, VersionModel version, String schedule_published_on, String organizer_description, String type, String code_of_conduct, String logo, String background_image, Call_for_papersModel call_for_papers, String privacy, String location_name, String end_time) {

		this.id = id;
		this._creator = creator;
		this.email = email;
		this.organizer_name = organizer_name;
		this.description = description;
		this.name = name;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.topic = topic;
		this.start_time = start_time;
		this.timezone = timezone;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}