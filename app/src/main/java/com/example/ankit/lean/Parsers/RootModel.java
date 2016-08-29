import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String code_of_conduct;
	public String start_time;
	public String schedule_published_on;
	public String logo;
	public String email;
	public String end_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String name;
	public String location_name;
	public String organizer_description;
	public String type;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public int id;
	public String privacy;
	public String state;

	public RootModel(String background_image, String description, CopyrightModel copyright, CreatorModel creator, String code_of_conduct, String start_time, String schedule_published_on, String logo, String email, String end_time, VersionModel version, Call_for_papersModel call_for_papers, String timezone, String name, String location_name, String organizer_description, String type, String topic, ArrayList<Social_linksModel> social_links, String organizer_name, int id, String privacy, String state) {

		this.background_image = background_image;
		this.description = description;
		this._copyright = copyright;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.email = email;
		this.end_time = end_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.name = name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.id = id;
		this.privacy = privacy;
		this.state = state;

	}

}