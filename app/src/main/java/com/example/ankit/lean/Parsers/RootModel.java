import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String type;
	public String end_time;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String location_name;
	public String state;
	public String code_of_conduct;
	public String privacy;
	public VersionModel _version;
	public String schedule_published_on;
	public String email;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public int id;
	public String background_image;
	public String organizer_description;
	public String topic;

	public RootModel(ArrayList<Social_linksModel> social_links, String logo, String type, String end_time, String organizer_name, CreatorModel creator, CopyrightModel copyright, String timezone, String name, String location_name, String state, String code_of_conduct, String privacy, VersionModel version, String schedule_published_on, String email, String description, Call_for_papersModel call_for_papers, String start_time, int id, String background_image, String organizer_description, String topic) {

		this.social_links = social_links;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.id = id;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.topic = topic;

	}

}