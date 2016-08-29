import java.util.ArrayList;

class RootModel {

	public int id;
	public String type;
	public String topic;
	public String name;
	public String start_time;
	public String organizer_description;
	public String organizer_name;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String location_name;
	public String logo;
	public String email;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String end_time;
	public VersionModel _version;

	public RootModel(int id, String type, String topic, String name, String start_time, String organizer_description, String organizer_name, String code_of_conduct, CopyrightModel copyright, String location_name, String logo, String email, String privacy, String schedule_published_on, CreatorModel creator, String timezone, Call_for_papersModel call_for_papers, String state, String background_image, ArrayList<Social_linksModel> social_links, String description, String end_time, VersionModel version) {

		this.id = id;
		this.type = type;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.location_name = location_name;
		this.logo = logo;
		this.email = email;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.background_image = background_image;
		this.social_links = social_links;
		this.description = description;
		this.end_time = end_time;
		this._version = version;

	}

}