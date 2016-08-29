import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String type;
	public String topic;
	public String start_time;
	public String code_of_conduct;
	public String end_time;
	public String timezone;
	public String background_image;
	public String logo;
	public String name;
	public VersionModel _version;
	public String state;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String location_name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public int id;

	public RootModel(Call_for_papersModel call_for_papers, String email, CreatorModel creator, String privacy, String type, String topic, String start_time, String code_of_conduct, String end_time, String timezone, String background_image, String logo, String name, VersionModel version, String state, String organizer_name, CopyrightModel copyright, String organizer_description, String location_name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String description, int id) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.type = type;
		this.topic = topic;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.timezone = timezone;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this._version = version;
		this.state = state;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.description = description;
		this.id = id;

	}

}